const extractVowels = (str) => {
  let arr = []
  let v = [];
  for(let i = 0; i < str.length; i++){
    //console.log('Index ' + i + ' ' + str[i]);
    if(/[aeiou]/.test(str[i])){
      v.push(str[i]);
      str = str.replace(str[i],'');
      i -= 1;
    }
  }
  v.sort();
  v = v.join('');
  arr.push(str);
  arr.push(v);
  return arr;
};

str1 = 'gregor';
str2 = 'The quick brown fox';

console.log(extractVowels(str1) );
console.log(extractVowels(str2) );
