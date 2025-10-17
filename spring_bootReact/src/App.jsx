import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <header className='header'>
        <h1>Spring Boot with React</h1>
        <nav className='menu'>
          <ul className='nav-links'>
            <li>
              <a href="#sobre">Sobre</a>
            </li>
            <li>
              <a href="#serviços">Serviços</a>
            </li>
            <li>
              <a href="#contato">Contato</a>
            </li>
          </ul>
        </nav>
      </header>
      <main className='main'>
        <table className='table'>
          <caption>Verify the output of mine API that i build in Java.</caption>
          <tr>
            <th>Nome</th>
            <th>Departamento</th>
            <th>Salário</th>
          </tr>
          <tr>
            <td>TESTES</td>
            <td>TESTES</td>
            <td>TESTES</td>
          </tr>
          <tr>
            <td>TESTES</td>
            <td>TESTES</td>
            <td>TESTES</td>
          </tr>
        </table>
      </main>
      <footer className='footer'>
        <p>&copy;2025 Todos os direitos reservados por Ariel Marinho</p>
      </footer>
    </>
  )
}

export default App
