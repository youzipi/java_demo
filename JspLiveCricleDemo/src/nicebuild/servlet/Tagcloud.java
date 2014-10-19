package nicebuild.servlet;


public class Tagcloud {
	private String text;
	private String weight;
	
	public Tagcloud(){
		
	}
	public Tagcloud(String text, String weight) {
		super();
		this.text = text;
		this.weight = weight;
		
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String toString() {
		return "{\"text\":\"" + text + "\", \"weight\":\"" + weight +  "\"}";
		
	}
	
	public static   String outputArray (Tagcloud[] tagcloudArray){
		String str="[";
		for(int i=0;i<tagcloudArray.length-1;i++){
			str+=tagcloudArray[i].toString();
			str+=",";
		}
		str+=tagcloudArray[tagcloudArray.length-1].toString();
		str+="]";
		return str;
	}
	public static void main(String args[]){	
	Tagcloud tagcloud[]={new Tagcloud(),new Tagcloud()};
		 tagcloud[0]=new Tagcloud("html","12");
		 tagcloud[1]=new Tagcloud("css","7");
		 System.out.print( outputArray(tagcloud));
}
}