package BookSearch;

import java.util.StringTokenizer;

public class yearCalc {	
	private String start_year;
	private String end_year;
	
	yearCalc(String start_year,String end_year){
		this.start_year=start_year;
		this.end_year=end_year;
	}
	
	public void calc(Book Book) {
		
		if(Book == null) {
			return;
		}
		
		int arr[][] = new int[3][4];		
		
		StringTokenizer start_stok = new StringTokenizer(this.start_year,"-");
		StringTokenizer end_stok = new StringTokenizer(this.end_year,"-");
		StringTokenizer year_stok = new StringTokenizer(Book.getYear(),"-");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==0) {
					arr[i][j]=Integer.parseInt(start_stok.nextToken());
				}else if(i==1) {
					arr[i][j]=Integer.parseInt(end_stok.nextToken());
				}else {
					arr[i][j]=Integer.parseInt(year_stok.nextToken());
				}
			}
			arr[i][3]=arr[i][0]*365+arr[i][1]*30+arr[i][2];
		}
		
		if(arr[0][3]<=arr[2][3] && arr[2][3]<=arr[1][3]) {
			Book.showInfo();
		}
		
	}
}
