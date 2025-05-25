import './App.css'
import sunrise from './assets/sunrise.jfif'
import afternoon from './assets/afternoon.jfif'
import sunset from './assets/sunset.jpg'
import night from './assets/night.jfif'

function App() {
    const now = new Date();
    const hour = now.getHours();
    let greeting;
    let image;

    if (hour >= 5 && hour < 12) {
        greeting = "Good Morning";
        image = sunrise;
    } else if (hour >= 12 && hour < 17) {
        greeting = "Good Afternoon";
        image = afternoon;
    } else if (hour >= 17 && hour < 21) {
        greeting = "Good Evening";
        image = sunset;
    } else {
        greeting = "Good Night";
        image = night;
    }
    
    return (
        <>
            <h1>{greeting}</h1>
            <img src={image} alt="" />
        </>
    )
}

export default App