# Maven Lifecycle
*   **O que é o Maven:**
    *   O Maven é basicamente uma ferramenta de **Project Management & Build Automation** para projetos Java.


*   **Fases da Default Lifecycle (Ciclo de Vida de Build):**
    *   **`validate`:** Primeiro passo. Verifica a integridade da estrutura do projeto e o arquivo `pom.xml` (que é o coração do projeto, onde ficam as configurações, dependências, plugins, etc.).
    *   **`compile`:** Compila o código-fonte principal. Pega os arquivos `.java` presentes no diretório `src/main/java` e os transforma em bytecode (`.class`).
    *   **`test-compile`:** Semelhante ao passo anterior, mas focado no código de teste. Compila os arquivos `.java` presentes em `src/test/java` para formato `.class`.
    *   **`test`:** Executa os testes unitários da aplicação utilizando os arquivos de teste compilados. Nesta fase, é utilizado o plugin `maven-surefire-plugin`.
    *   **`package`:** Compacta o código compilado e gera o artefato final (como um arquivo `.jar` ou `.war`) dentro da pasta `target/`.
    *   **`integration-test`:** Executa os testes de integração do projeto. Para estes testes, é utilizado o plugin `maven-failsafe-plugin`.
    *   **`verify`:** Realiza verificações de qualidade e valida se os critérios do build foram atingidos. Executa ferramentas de cobertura de código (como o `jacoco-maven-plugin` para medir linhas, métodos e ramificações cobertas por teste) e analisa os resultados dos testes de integração.
    *   **`install`:** Copia o pacote compilado (`.jar`) para o repositório Maven local (`~/.m2/repository`). Essa pasta guarda as bibliotecas baixadas da internet e os artefatos locais para que outros projetos na mesma máquina possam utilizá-los.
    *   **`deploy`:** Envia o artefato final consolidado para um repositório remoto (como Nexus ou Artifactory) para disponibilização a outros desenvolvedores e sistemas. Esta fase utiliza o `maven-deploy-plugin`.