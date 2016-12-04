import java.io.File;


class Directories{
	String _dirname="E://";
		
	void mainTask(){
		File _file=new File(_dirname);
		if(_file.isDirectory())
		{
			System.out.println( "Derectory of"+_dirname);
			String a[]=_file.list();
			for(int i=0;i<a.length;i++)
			{
				File _f =new File(_dirname+"/"+a[i]);
				if(_f.isDirectory())
					{
						System.out.println( a[i] +" is a Directory");
					}
					else{
							System.out.println( a[i] +" is a file");
					}
			}
		}
		else
		{
			System.out.println("\n\n"+_dirname +" is not a Directory \n\n");
				
		}
	}
		 public static void main(String args[]){
		 
		 // Here we use a method ... :)
		 Directories d = new Directories ();
		 d.mainTask();
	 }
}