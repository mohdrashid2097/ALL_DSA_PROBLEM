package DesignPattern;

public class SingleDoubleCheckLock {
	private static volatile SingleDoubleCheckLock dbConnection;
	
	private SingleDoubleCheckLock() {
		
	}
	
	public static SingleDoubleCheckLock getDBConnection() {
		if(dbConnection == null) {
			synchronized (SingleDoubleCheckLock.class) {
				if(dbConnection == null) {
					dbConnection = new SingleDoubleCheckLock();
				}
			}
		}
		
		return dbConnection;
	}

}
// this is called double checked lock solution of single class