/*
Kreirati formu za prijavu kandidata za posao. Izgled forme je dat na slici
*/ 

import slika from './../assets/images/zad5.PNG';
import './zadatak5_css.css';
const Zadatak_J5 = () => {
    return  (<div>
        <h2> Zadatak 5</h2>
        <div className='zad5_container'>
        <div> 
            <p> Slika na osnovu koje treba napraviti formu</p>
            <img src={slika} alt="asd"/>
        </div>
        <div>
        {/* to do: ovde kreirati formu */}
        <p> TO DO: FORMA</p>
        </div>

        <form>
            <h2>1. Candidate info</h2>

            <div>
                <input type="text" placeholder="Your Name *"/>
            </div>
            <br />
            <br />

            <div>
                <input type="email" placeholder="Your Email*" />
            </div>
            <br />
            <br />

            <div>
                <textarea type="text" placeholder="About yourself" />
            </div>

            <h4>Interests:</h4>

            <div>
            <select>
                <option>Fishing</option>
                <option>Cycling</option>
            </select>
            </div>

            <h2>Additionl Info</h2>

            <div>
                <textarea type="text" placeholder="About Your School"/>
            </div>
            <br />
            <br />

            <div>
                <button>Apply</button>
            </div>
            
        </form>
    </div>
    </div>);
}

export default Zadatak_J5;