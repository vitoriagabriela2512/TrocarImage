TrocarImage – Aplicativo de Troca de Imagens no Android
📌 Descrição do Projeto

O TrocarImage é um aplicativo Android desenvolvido em Java no Android Studio que permite ao usuário alternar entre duas imagens ao clicar em botões.

Ao selecionar uma imagem, o aplicativo:

Exibe a foto correspondente no ImageView.
Atualiza um TextView com o nome da imagem selecionada.

Este projeto tem como objetivo praticar:

Manipulação de ImageView
Uso de Button
Tratamento de eventos com OnClickListener
Organização de recursos (drawable)
Personalização do ícone do aplicativo
Geração de APK assinado para instalação em dispositivos Android
🎯 Objetivo

Demonstrar como trocar dinamicamente imagens em um aplicativo Android e preparar o projeto para distribuição em formato APK.

🛠️ Tecnologias Utilizadas
Java
Android Studio
XML
Android SDK
Material Design

📂 Estrutura do Projeto
app/

├── src/

│   └── main/

│       ├── java/

│       │   └── br/ulbra/trocarimage/

│       │       └── MainActivity.java

│       ├── res/

│       │   ├── drawable/

│       │   │   ├── foto1.png

│       │   │   └── foto2.png

│       │   ├── layout/

│       │   │   └── activity_main.xml

│       │   └── mipmap/

│       │       └── ic_launcher.*

│       └── AndroidManifest.xml

🖼️ Funcionalidades do Aplicativo
Exibição inicial de uma imagem.
Botão Foto 1 para carregar foto1.
Botão Foto 2 para carregar foto2.
Atualização do texto para indicar qual foto está sendo exibida.
Ícone personalizado do aplicativo.
APK assinado para instalação no celular.
🧠 Lógica de Funcionamento
Botão Foto 1
imgfoto.setImageResource(R.drawable.foto1);
txFoto.setText("Foto 1");
Botão Foto 2
imgfoto.setImageResource(R.drawable.foto2);
txFoto.setText("Foto 2");
📄 AndroidManifest.xml

O arquivo AndroidManifest.xml define:

Ícone do aplicativo (ic_launcher)
Nome do aplicativo
Tema
Activity principal (MainActivity)
<application
    android:icon="@mipmap/ic_launcher"
    android:roundIcon="@mipmap/ic_launcher_round"
    android:theme="@style/Theme.TrocarImage">
🖥️ Interface do Usuário

A tela principal contém:

ImageView para exibir as imagens.
TextView para mostrar o nome da foto.
Dois botões:
Foto 1
Foto 2
▶️ Como Executar
Abra o projeto no Android Studio.
Adicione as imagens foto1.png e foto2.png na pasta res/drawable.
Execute o aplicativo em um emulador ou dispositivo Android.
Clique nos botões para alternar entre as imagens.
🎨 Personalização do Ícone do Aplicativo
Passo 1 – Preparar a Imagem
Utilize um arquivo PNG quadrado (512x512 ou 1024x1024 pixels).
Passo 2 – Abrir o Image Asset Studio
Clique com o botão direito em app.
Selecione New > Image Asset.
Passo 3 – Configurar o Ícone
Tipo: Launcher Icons (Adaptive and Legacy)
Nome: ic_launcher
Passo 4 – Selecionar a Imagem
Asset Type: Image
Escolha o arquivo PNG.
Passo 5 – Configurar o Fundo
Asset Type: Color
Escolha a cor desejada.
Passo 6 – Gerar
Clique em Next e depois em Finish.
✅ Resultados Esperados
O aplicativo alterna corretamente entre as duas imagens.
O nome da imagem é exibido no TextView.
O aplicativo aparece com o ícone personalizado.
O APK pode ser instalado em qualquer dispositivo Android.
📚 Conceitos Aplicados
ImageView
Button
TextView
setImageResource()
setText()
OnClickListener
AndroidManifest.xml
Launcher Icons
APK Assinado
👨‍💻 Autor

Projeto desenvolvido por Vitória Gabriela Fernandes da Luz para fins acadêmicos na disciplina de Programação Mobile – ULBRA.
