package employee;

public class Developer  extends Employee{
		private String programmingLangugae;
		
		Developer(String programmingLanguage,String name, String id){
			super(name, id);
			this.programmingLangugae = programmingLanguage;
		}
		
		public String programmingLanguage() {
			return programmingLangugae;
		}
		public void setProgrammingLanguage(String programmingLanguage) {
			this.programmingLangugae = programmingLanguage;
		}
		@Override
		public String toString() {
			return "Developer [Programming Language=" + programmingLangugae +" Name="+super.getName()+" Id="+super.getId()+ "]";
		}
		
		
}
