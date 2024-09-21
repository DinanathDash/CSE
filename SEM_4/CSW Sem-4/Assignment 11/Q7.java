import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Q7 {

    public static void main(String[] args) {
        CompletableFuture<String> fetchDataFromServer = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Data from server";
        });

        CompletableFuture<String> processLargeFile = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Data from file";
        });

        CompletableFuture<String> combinedFuture = fetchDataFromServer.thenCombine(processLargeFile, (serverData, fileData) -> {
            return "Combined Result: " + serverData + " + " + fileData;
        });

        combinedFuture.thenAccept(result -> {
            System.out.println(result);
        });

        try {
            combinedFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
