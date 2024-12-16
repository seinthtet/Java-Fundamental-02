import java.util.Arrays;

public class StorageDemo{

	public static void main(String[] args) {
		Storage storage = new Storage();

		storage.add("Hello");
		storage.add("Java");
		storage.add("Encapusalation");

		storage.show();

		String [] array = storage.getArray();
		Arrays.fill(array, null);
		storage.show();

	}
}