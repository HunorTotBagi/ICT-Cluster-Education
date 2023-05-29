/* 
    Zadatak 8
    Napisati funkciju koja preuzme funkciju, listu, i naziv i vrati novu funkciju koja se ponaša isto kao i prosleđena funkcija samo što, se u listu upisuje svaki poziv funkcije sa parametrima u obliku stringa koji, ako je funkcija pozvana sa parametrima 3 i 4, recimo, bude "f(3,4)" gde je 'f' štagod da je u nazivu
*/

const make_log = (f,l,n="f") => {
  return (...x) => {
    l.push(`${n}(${x.join(",")})`);
    return f(...x);
  }
}

const JSV8 = () => {
  let log = [];
    const lsin = make_log(Math.sin, log, "sin");
    let r = [];
    for(let t = 0.0; t < 2 * Math.PI; t += 0.1){
      lsin(t);
    }
  return <div>
      <pre>
            {JSON.stringify(log, null, 4)}
        </pre>
  </div>;
};

export default JSV8;
