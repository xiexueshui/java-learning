import java.io.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @auther xxs
 * @date 2021-06-21
 */
public class main {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        int lineNum = 47088;
        File file = new File("C:\\Users\\76803\\Desktop\\川");
        File[] files = file.listFiles();
        List<bean> list = new LinkedList<>();
        ExecutorService executorService = new ThreadPoolExecutor(8, Integer.MAX_VALUE, 3L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(8));

        for (int i = 0; i <= files.length / 10; i++) {
            File[] files1 = new File[10];
            if (i == files.length / 10) {
                System.arraycopy(files, i * 10, files1, 0, files.length % 10);
            } else {
                System.arraycopy(files, i * 10, files1, 0, 10);
            }
            Future<List<bean>> submit = executorService.submit(
                    new Callable<List<bean>>() {
                        @Override
                        public List<bean> call() throws Exception {
                            return get3034Data(files1,lineNum);
                        }
                    }
            );

            list.addAll(submit.get()) ;
        }
        executorService.shutdown();
        list.sort((o1,o2)->{ return o1.getSort().compareTo(o2.getSort()); });
        File outF = new File("D://"+lineNum+"行数据.TXT");
        FileWriter writer = new FileWriter(outF);
        list.forEach(e->{
            try {
                writer.write(e.getXyz()+ " \r\n");

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        writer.close();

    }


    public static List<bean> get3034Data(File[] files,int lineNum) throws IOException {

        List<bean> list = new LinkedList<>();
        for (File file : files) {
            if(file != null){
                bean bean = new bean();
                String str = "";
                String fileName = file.getName();
                String[] fileNameSortList = fileName.split("-");
                Integer fileNameSort = Integer.valueOf(fileNameSortList[4]);
                bean.setSort(fileNameSort);
                bean.setName(fileName);
                FileReader in = new FileReader(file);
                LineNumberReader reader = new LineNumberReader(in);
                while (reader.getLineNumber() < lineNum) {
                    str = reader.readLine();
                }
                bean.setXyz(str);
                reader.close();
                in.close();
                list.add(bean);
                System.out.println("文件名:" + fileName + "         第"+lineNum+"行数据" + str);
            }
        }
        return list;
    }


}
