import ImgDollar from '../../assets/img/dollar.png'
import '../../assets/css/styles.css'

const NavBar = () => {
    return (
        <div>
            <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-light border-bottom shadow-sm">
                <div className="container">
                    <nav className="my-2 my-md-0 mr-md-3">
                        <img src={ImgDollar} alt="Dollar" width="120" />
                    </nav>
                </div>
            </div>
        </div>
    )
}

export default NavBar;