import java.io.*;
class File_Contents_Check_Demo
{
	public static void main(String args[]) throws IOException
    {
    	String dir_name = "../Identical_File_Check/";
    	String file_name1 , file_name2;

    	File file_obj = new File( dir_name );

		String[] file_names = file_obj.list();

		for( int i = 0 ; i < file_names.length - 1 ; i++ )
		{
			file_name1 = dir_name + file_names[i];

			for( int j = i+1 ; j < file_names.length ; j++ )
			{
				file_name2 = dir_name + file_names[j];

				if( compare_files( file_name1 , file_name2 ) )

					System.out.println( file_names[i]+" and "+file_names[j]+
										" have same contents..");

			}
		}
     }
  static boolean compare_files( String file1 , String file2 ) throws IOException
  {
	FileReader input_file1 = new FileReader( file1 );
	FileReader input_file2 = new FileReader( file2 );

	int i = 0 , j = 0;
	do
	{
		i = input_file1.read();
		j = input_file2.read();
		if(i != j)
			break;
	} while(i != -1 && j != -1);

	input_file1.close();
	input_file2.close();

	if(i != j)
		return false;
	else
		return true;
    }
  }
