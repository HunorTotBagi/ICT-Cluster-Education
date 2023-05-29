/* 
    Zadatak 6
    Napisati funkciju koja računa koliko je dobar pangram neki string. Pangram je rečenica koja ima u sebi sva slova nekog jezika. Ovde nas samo zanima engleksi jezik radi jednostavnosti. Velika i mala slova ignorišemo, baš kao i apsolutno sve što nije slovo. Kvalitet pangrama definiše sledeće pravilo: ako nemamo sva slova, onda je kvalitet 0. Ako imamo sva slova, onda je kvalitet jednak broju slova u azbuci jezika (26 ovde) podeljenom sa brojem slova koji pangram u stvari ima. Savršen pangram (bez ponavljanja) onda ima rezultat 1. 
*/
const evaluate_pangram = (p) => {
  let ap = Array.from(p.toLowerCase()).filter((v) => Boolean(v.match(/[a-z]/)));
  let lp = ap.length;
  let sp = new Set(ap);
  console.log(sp.length);
  if(sp.size != 26){
      return 0;
  }

  return 26 / lp;
}

const JSV6 = () => {
  return <div>
    <table border={1}>
            <tr><th>Pangram</th><th>Kvalitet</th></tr>
            <tr><td>JavaScript</td><td>{evaluate_pangram("JavaScript").toPrecision(2)}</td></tr>
            <tr><td>The quick brown fox jumps over the lazy dog.</td><td>{evaluate_pangram("The quick brown fox jumps over the lazy dog.").toPrecision(2)}</td></tr>
            <tr><td>Jink cwm, zag veldt, fob Qursh pyx!</td><td>{evaluate_pangram("Jink cwm, zag veldt, fob Qursh pyx!").toPrecision(2)}</td></tr>
        </table>
  </div>;
};

export default JSV6;
