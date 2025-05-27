import './App.css'
function Registration() {

    return (
        <>
            <fieldset id='fieldset'>
                <legend>Registration Component:</legend>
                <form action="" method="post">
                    <input type="text" placeholder='Name' />
                    <input type="email" placeholder='Email' />
                    <input type="text" placeholder='Username' />
                    <input type="password"  placeholder='Password' />
                    <input type="text" placeholder='Address' />
                    <input type="tel" placeholder='Contact #' />
                   <input id="submit" type='submit' value='Sign Up'/>

                </form>
            </fieldset>
        </>
    );
}
export default Registration;