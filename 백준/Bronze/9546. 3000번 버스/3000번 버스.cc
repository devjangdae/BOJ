#include<cstdio>
#include<cmath>
int main(){
	int tc,x;
	scanf("%d",&tc);
	while(tc--){
		scanf("%d",&x);
		double res = pow(2.0,x)-1;
		printf("%.f\n",res);
	}
}