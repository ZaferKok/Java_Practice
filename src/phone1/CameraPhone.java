package phone1;

public class CameraPhone extends Phone{
	  
	  public CameraPhone() {
		  super();
	  }
	
	  public CameraPhone(int imageSize, int memorySize) {
	      super( imageSize,  memorySize);
	  }

	  public int numPictures(){
	      return (memorySize*1000)/imageSize;

	  }
}