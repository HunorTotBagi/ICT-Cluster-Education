/* 
    Zadatak 4
    Napisati funkciju koja za dva stringa odredi da li su anagrami ili ne. Razmaci nisu bitni, velika i mala slova nisu bitna, interpunkcija nije podržana.
*/

const is_anagram = (a,b) => {
  let aa = Array.from(a.toLowerCase()).filter((v) => v != ' ').sort();
  let bb = Array.from(b.toLowerCase()).filter((v) => v != ' ').sort();

  if(aa.length != bb.length) return false;
  for(let i=0; i < aa.length; i++){
    if(aa[i] != bb[i]){
      return false;
    }
  }
  return true;
}

const JSV4 = () => {
  return <div>
    <table>
            <tr><td>"JavaScript" i "TypeScript" {is_anagram("JavaScript", "TypeScript") ? "jesu anagrami" : "nisu anagrami"}.</td></tr>
            <tr><td>"Internet Anagram Server" i "I Rearrangement Servant" {is_anagram("Internet Anagram Server", "I Rearrangement Servant") ? "jesu anagrami" : "nisu anagrami"}.</td></tr>
        </table>
  </div>;
};

export default JSV4;
