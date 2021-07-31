import { BrowserRouter, Route, Switch } from "react-router-dom";
import Home from './pages/Home'
import Report from "./pages/Report";

const Routes = () => {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/" exact>
                    <Home />
                </Route>

                <Route path="/report" exact>
                    <Report />
                </Route>
            </Switch>
        </BrowserRouter>
    )
}

export default Routes;