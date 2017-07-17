# Minicurso de Desenvolvimento Android
<strong>Aprendendo a criar aplicações para dispositivos móveis e destacando-se no mercado de trabalho.</strong>

<b>Sobre o projeto:</b>

<pre>
<b>Oque é?</b>
	*Projeto de Ensino do programa PET Fronteira e GIRA.
<b>Motivação</b>
	*Dispertar o interesse dos acadêmicos para o mundo mobile (Lado Android da Força ).
<b>Objetivo</b>
	*Ensinar as principais técnicas de desenvolvimento Android, apresentando as 
	ferramentas e os principais componentes do processo de desenvolvimento de um aplicativo.

<b>Ministrante do minicurso:
	Discente: Mário de Araújo Carvalho
	E-mail: mariodearaujocarvalho@gmail.com
	GitHub: <a href="https://github.com/MarioDeAraujoCarvalho" target="_blank">https://github.com/MarioDeAraujoCarvalho</a>
	Unidade: UFMS - CPPP
	Grupo: <a href="http://pet.nerdsdafronteira.com/" target="_blank">PET Fronteira</a>
<b>

<b>Orientador:
	Docente: Profº. Dr. Anderson Lima
	E-mail: anderson.correa.lima@gmail.com
	Unidade: UFMS - CPPP
	Grupo: <a href="#" target="_blank">GIRA</a>
<b> 
</pre>

<b>ABAIXO segue uma breve DOCUMENTAÇÃO sobre a utilização da biblioteca.</b>

 ```php
		/*Exemplo de utilização da biblioteca*/
	
		//Codificação da Página
		ini_set('default_charset','UTF-8');
		
		//Inclusão da biblioteca User Data Collector WEB 1.0.0
		include_once('UserInformation.php'); // Nome da Classe igual ao nome do arquivo!
		use UserDataCollector\UserInformation as InfosUser; // Posso nomear como bem entender ao usar namespace
		
		//Definição da zona para poder pegar o horário do usuário.
		date_default_timezone_set('America/Sao_Paulo');

		//Instancia da Classe UserInformation
		$user_informations = new InfosUser();
		
		//Coletando o horário
		echo 'Horário de Acesso (Brasília): '.$user_informations->get_Data_Horario();
		echo("<br>");
		//Coletando o IP (Internet Protocol) do usuário
		echo 'IP do Usuário: '.$user_informations->get_IP();
		echo("<br>");
		//Coletando o Sistema Operacional do usuário
		echo 'Sistema Operacional: '.$user_informations->get_SO();
		echo("<br>");
		//Coletando
		echo 'Navegador(Browser): '.$user_informations->get_Browser_User();
		echo("<br>");
		//Coletando detalhes sobre o navegador e Sistema Operacional do usuário
		echo 'Mais detalhes sobre o navegador e SO: '.$user_informations->getMaisDetalhesUserAndBrowser();
		echo("<br>");
		//Coletando o disposivo do usuário
		echo 'Dispositivo de Acesso: '.$user_informations->get_Device_User();
		echo("<br>");
		
		/**Coletando a geolocalização
		 **OBS: No localhost não ira funcionar. Pois você precisará fornecer um IP conectado na WEB.
		 **
		 **/
		$geo_localizacao  = $user_informations->getLocalizacao();
		//Coletando a latitude do usuário
		echo 'Latitude: '.$geo_localizacao['latitude'];
		echo("<br>");
		//Coletando a longitude do usuário
		echo 'Longitude: '.$geo_localizacao['longitude'];
		echo("<br>");
  ```
  
  </br>
  <b>Seja livre para contribuir com o projeto, usando-o e melhorando.</b>
  </br>
  </br>

<b>Seu site usa essa biblioteca? Você pode promovê-lo aqui! Basta enviar o seu pedido que serei feliz em divulgar.</b>

#Sobre uso dos códigos e apresentações desenvolvidos no minicurso
===================
Os códigos desenvolvidos durante o minicurso são totalmente 
gratuitos e estão sobre a Licença Apache 2.0 e podem ser usuados segundo os termos da licença.
Já as apresentações são de propriedade intelectual da UFMS-CPPP, Grupo PET Fronteira e Grupo GIRA. Qual utilização de 
alguma parte das apresentações, devem ser citados as entidades acima como proprietárias.
<br>

#Licença
===================
``` 
        Copyright 2017 Mário de Araújo Carvalho
 
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
 
      http://www.apache.org/licenses/LICENSE-2.0
 
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.

````

<a href="https://github.com/MarioDeAraujoCarvalho/MiniCursoAndroid/blob/master/LICENSE" target="_blank">Mais detalhes sobre a licença</a>
