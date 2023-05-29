/* 
    Zadatak 9
    Napisati funkciju koja za dati tekst vrati procenat upotrebe svih slova u redosledu abecede. Mala i velika slova se ignorišu, razmaci i znakovi interpunkcije se ignorišu. Za potrebe ovoga, samo se razmatra engleska abeceda. 
*/

const brojanje_slova=(str1)=>{
  
    let re = /\s/g;
    let str1a = str1.toLowerCase().replace(re, '');
    let str1c= str1a.split('').sort();
    let str=Array.from(str1c)
    let niz = [];
      if( str.length === 0 ){ 
        return "Prazan string";
      }
      
      for( let i = 0 ;i < str.length ;i++){
        let count = 0;
        for( let j = 0-1 ;j < str.length ;j++){
          if( str[i] === str[j]){
            count++;
          }
        }
        if( count > 0){
            let tekst = "Slovo  " +  str[i] + " sadrzi se " +  count + " puta u textu. A to je  "  + count/str.length +  " posto u textu.";
            niz.push(tekst);
        }
      }

      return niz;
  
    }
  
  
  const JSV9 = () => {
    return <div>{JSON.stringify (brojanje_slova("A pangram is a string that contains every letter of the English alphabet. We are required to write a JavaScript function that takes in a string as the first and the only argument and determines whether that string is a pangram or not."))}</div>;
  
  };

  export default JSV9;