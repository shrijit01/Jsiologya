package Test7;

public class HelpAmoraHM4 {
	//Cpp code++++++++++++++++++++++++++++++++++++++++++++
//	#include<bits/stdc++.h>
//
//	#include <iostream>
//	#include <string>
//
//	using namespace std;
//
//	int e[50005][35];
//
//	int main(){
//	    int q, a, b, c, d;
//	    string s;
//	    cin >> s;
//	    cin >> q;
//	    e[0][s[0] - 97]++;
//	    for(int w = 0 ; w < 26 ; w++){
//	        e[0][w] = 0;
//	    }
//	    for(int i = 1 ; i <= s.size() ; i++){
//	        for(int j = 0 ; j < 26 ; j++){
//	            e[i][j] = e[i - 1][j];
//	        }
//	        e[i][s[i - 1] - 97]++;
//	    }
//
//	    for(int v = 0 ; v < q ; v++){
//	        cin >> a >> b >> c >> d;
//	        int p = 1;
//	        for(int l = 0 ; l < 26 ; l++){
//	            if((e[b][l] - e[a - 1][l]) != (e[d][l] - e[c - 1][l])){
//	                p = 0;
//	                break;
//	            }
//	        }
//	        if(p == 0)
//	            cout << "false" << endl;
//	        else
//	            cout << "true" << endl;
//	    }
//
//	    return 0;
//	}
	
	
}
