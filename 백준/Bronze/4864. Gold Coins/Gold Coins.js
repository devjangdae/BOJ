var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().trim().split('\n').map(v => +v);
var res = '';

for(var i=0; i<input.length-1; i++){
    var day = input[i];
    var coin = 0, cnt = 1, idx = cnt;

    for(var j=1; j<=day;){
        idx = (j + cnt > day) ? day - j + 1 : cnt;

        for(var k=1; k<=idx; k++){
            coin += cnt;
        }
        j += cnt;
        cnt++;
    }

    res += day + ' ' + coin + '\n';
}
console.log(res.trim());