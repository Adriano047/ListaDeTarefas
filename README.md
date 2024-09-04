<a id="readme-top"></a>
# Lista De Tarefas
Uma lista de tarefas que permite ao usuário adicionar, remover e listar tarefas em um loop contínuo até que ele decida sair. Além disso, possui tratamento de erros para garantir uma experiência de usuário mais robusta e amigável.

## Funcionalidades

- **Adicionar Tarefa:** O usuário pode adicionar uma nova tarefa fornecendo uma descrição. Se a descrição estiver vazia, o programa informará que a tarefa não pode ser adicionada.
- **Marcar Tarefa:** O usuário pode altera o status de uma tarefa existente ao fornecer o número correspondente. Se o número fornecido não for válido ou se a entrada não for um número, o programa exibirá uma mensagem de erro.
- **Listar Tarefas:** O usuário pode visualizar a lista de todas as tarefas atuais. Se não houver tarefas na lista, o programa informará que a lista está vazia.

## Telas 
### Menu:
![Menu](https://private-user-images.githubusercontent.com/106997880/364365142-b9176204-d0d0-4b7d-8e2d-3754daf76c35.PNG?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjU0NTE3NDQsIm5iZiI6MTcyNTQ1MTQ0NCwicGF0aCI6Ii8xMDY5OTc4ODAvMzY0MzY1MTQyLWI5MTc2MjA0LWQwZDAtNGI3ZC04ZTJkLTM3NTRkYWY3NmMzNS5QTkc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTA0JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwNFQxMjA0MDRaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yMWQ2NmJhNGI0ZTNkMWUzZDE0NWU2ZDkzODU1YjQzMmY1MzIwYTVkMzQ1MjU4MDYxMjMwYzY2NzY3NjU3YzVmJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.nj5yxjiEDoClWjzc-CdXKQgo-0RuYfEkQoexDghK0k8)

### Adicionar:
![Adicionar](https://private-user-images.githubusercontent.com/106997880/364365148-52a13997-0fc9-48a4-a298-80ad8f057296.PNG?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjU0NTIwMDYsIm5iZiI6MTcyNTQ1MTcwNiwicGF0aCI6Ii8xMDY5OTc4ODAvMzY0MzY1MTQ4LTUyYTEzOTk3LTBmYzktNDhhNC1hMjk4LTgwYWQ4ZjA1NzI5Ni5QTkc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTA0JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwNFQxMjA4MjZaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1kODM1MTUwMjY5MzlmZjkyZWNlYWNiMjMzYjk1YzE1NTI4MTQ1OTYwMTY0ZDkxMTAzNGNjNzIwZDcxZTdhNWJkJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.p-rAuylJrqMAdD4XToCstwgxRbqIsLZDKMgZOQhYjYw)

### Mudar Status:
![Marcar](https://private-user-images.githubusercontent.com/106997880/364365153-cdb9bd35-825b-4bfd-95fd-fddb196f2d10.PNG?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjU0NTIwMDYsIm5iZiI6MTcyNTQ1MTcwNiwicGF0aCI6Ii8xMDY5OTc4ODAvMzY0MzY1MTUzLWNkYjliZDM1LTgyNWItNGJmZC05NWZkLWZkZGIxOTZmMmQxMC5QTkc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTA0JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwNFQxMjA4MjZaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0xY2MyMWZiNGEzNGI1NjAwMjRhYmM1OGE4YTM4ZGVkMmY0MzBjNmU1ZTkzNjZhNjNkZTY5MjBiZWU2MmY3NjRlJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.Vv0LLpVPIvqFhku1dNtrNpMWm5QQF95tNScxVHXXsz0)

### Listar:
![Listar](https://private-user-images.githubusercontent.com/106997880/364365156-5241aee0-524a-4679-b39f-ed8907121c95.PNG?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjU0NTIwMDYsIm5iZiI6MTcyNTQ1MTcwNiwicGF0aCI6Ii8xMDY5OTc4ODAvMzY0MzY1MTU2LTUyNDFhZWUwLTUyNGEtNDY3OS1iMzlmLWVkODkwNzEyMWM5NS5QTkc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTA0JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwNFQxMjA4MjZaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1hZjE2ZDA2NDc4Y2UzZmMyMDNiMjRjNzIzOGI5ZWQzNTMwZTA2Y2M5ODUxZWE4NzljOTM4YjA1YWFkYTc3NDcyJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.5N1wKuPLxkn0CMZkpy9cUQfxfd6_kY8iPoCJU2aOQqM)

## :octocat: Faça o clone do projeto

```bash
# Clone este repositório
$ git clone <https://github.com/gabriel-mend/me.git>

# Acesse a pasta do projeto no terminal/cmd
$ cd me

```
## 👨🏻‍🚀 Sobre mim
"Conecte-se comigo no LinkedIn para explorar minha trajetória profissional e colaborar em projetos incríveis."
<table>
  <tbody>
    <tr>
      <td align="center" valign="top" width="14.28%"><a href="https://www.linkedin.com/in/cardosodev047/"><img src="https://media.licdn.com/dms/image/v2/D4D03AQFRff9YjluTHQ/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1713879990636?e=2147483647&v=beta&t=AIThEkfC267uJ_bVz5bpXdPbuvQlDzdWdeb4JgeSkxQ" width="100px;" alt="Kent C. Dodds"/><br /><sub><b>Adriano Cardoso Santos</b></sub></a><br />
    </tr>
  </tbody>
</table>

<p align="right">(<a href="#readme-top">Voltar ao topo</a>)</p>


