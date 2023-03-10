package javabasic.ch08;

class Ex8_11 {
	public static void main(String[] args) {
		try {
			startInstall();        //프로그램 설치에 필요한 준비를 한다
			copyFiles();           //파일들을 복사한다.
		} catch (SpaceException e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		} catch (MemoryException me) {
			System.out.println("에러 메시지 : " +me.getMessage());
			me.printStackTrace();
			System.gc();          //Garbage Collection을 수행하여 메모리를 늘려준다.
			System.out.println("다시 설치를 시도하세요");
		} finally {
//			deleteTempFiles();    //프로그램 설치에 사용된 임시파일들을 삭제
		} // try의 끝
	} // main의 끝

	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("설치할 공간이 부족합니다.");
		if(!enoughMemory())
			throw new MemoryException("메모리가 부족합니다.");
	} // startInstall메소드의 끝
	
	static void copyFiles() {/*파일들을 복사하는 코드를 적는다.*/}
	static void deletTempFiles() {/* 임시파일들을 삭제하는 코드를 적는다*/}
	
	static boolean enoughSpace() {
		//설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
		return false;
	}
	static boolean enoughMemory() {
		//설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
		return true;
	}
} //ExceptionTest클래스의 끝

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}
class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}
	

