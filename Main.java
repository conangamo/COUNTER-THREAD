package Thread;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		int numThread = 6;
		int incrementPerThread = 5;
		IncrementThread[] threads = new IncrementThread[numThread];

		for (int i = 0; i < numThread; i++) {
			threads[i] = new IncrementThread(counter, incrementPerThread);
			threads[i].start();
		}
		try {
			for (IncrementThread thread : threads) {
				thread.join();
			}
		} catch (InterruptedException e) {
			// Handle exception
			e.printStackTrace();
		}
	}
}
