import { Link } from "react-router-dom";
import Footer from "../../components/Footer";
import NavBar from "../../components/NavBar";

const Home = () => {
    return (
        <>
            <NavBar />
            <div className="content container">
                <div className="jumbotron">
                    <h1 className="display-4 py-3">Minhas Finanças</h1>
                    <p className="lead">Analise seus gastos pessoais</p>
                    <hr />
                    <p>Esta aplicação consiste em exibir um relatório a partir de dados fornecidos por um back end construído com Spring Boot.</p>
                    <Link className="btn btn-primary btn-lg" to="/report">
                        Acessar Relatório
                    </Link>
                </div>
            </div>
            <Footer />
        </>
    )
}

export default Home;