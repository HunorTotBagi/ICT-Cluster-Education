/* 
    Zadatak 5
    Napisati funkciju koja za dati string kaže da li je palindrom (čita se isto i sa jedne i sa druge strane). Razmaci i mala/velika slova nisu bitni, a interpunkcija nije podržana. 
*/

const is_palindrome = (s) => {
  let a = Array.from(s.toLowerCase()).filter((v) => v != " ");
  let b = [...b];
  b.reverse();
  for(let i = 0; i < a.length; i++){
    if(a[i] != b[i]){
        return false;
    }
  }
  return true;
}

const JSV5 = () => {
  return <div>
    <table>
            <tr><td> "Antena" {is_palindrome("Antena") ? "jeste palindrom" : "nije palindrom"}.</td></tr>
            <tr><td> "Ana voli Milovana" {is_palindrome("Ana voli milovana") ? "jeste palindrom" : "nije palindrom"}.</td></tr>
            <tr><td> "A man a plan a canal Panama" {is_palindrome("A man a plan a canal Panama") ? "jeste palindrom" : "nije palindrom"}.</td></tr>
        </table>
  </div>;
};

export default JSV5;
