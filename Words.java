package words;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dictionary webster = new Dictionary();
		
		
		System.out.println("Number of pages: " +  webster.getPages());
		System.out.println();
		System.out.println("Number of defintions " + webster.getDefinitions());
		System.out.println();
		System.out.println("Number of Defintions per page: " + webster.computeRatio());
		
		
		
		}
		}
	
	
	class Book{
		protected int pages = 1750;
		public void setPages(int numPages) {
			pages = numPages;
					}
		public int getPages() {
		return pages;
					}
		}
	
	
	class Dictionary extends Book{
		private int definitions = 52500;
		
		public double computeRatio() {
		return(double) definitions/getPages();
		}
		
		public void setDefintions(int numDefinitions) {
			definitions = numDefinitions;
		}
		
		public int getDefinitions() {
			return definitions;
		}
		}



