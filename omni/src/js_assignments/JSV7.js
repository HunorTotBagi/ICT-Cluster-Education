/* 
    Zadatak 7
    Napisati funkciju koja za dati dan (1-31), mesec (1-12), i godinu (četiri cifre) koji predstavljaju datum rođenja, vrati koliko je osoba rođena na taj dan bila živa, u sekundama. Program ne treba da radi za datume pre 1970. 
*/

const count_seconds = (dan, mesec, godina) => {
  let sad = new Date();
  let bday = new Date(`${godina}-${mesec}-${dan}`);
  let delta = sad.valueOf() - bday.valueOf();
  return delta / 1000;
}

const JSV7 = () => {
  return <div>
    Ako ste rođeni 17.11.1974. živi ste {count_seconds(17, 11, 1974)} sekundi.
  </div>;
};

export default JSV7;
