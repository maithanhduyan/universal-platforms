# [Clean Architecture](https://github.com/ardalis/CleanArchitecture)

#### src
1 - Core

```
dotnet new classlib -n Core
```

2 - Infrastructure

```
dotnet new classlib -n Infrastructure
```

3 - SharedKernel

```
dotnet new classlib -n SharedKernel
```

4 - Web

```
dotnet new mvc -n Web
```

### tests

```
dotnet test
```

Create solution
~~~~
dotnet new sln -n cleanarchitecture
~~~~
Add project to solution
~~~~
dotnet sln cleanarchitecture.sln add .\src\Core\Core.csproj  .\src\Infrastructure\Infrastructure.csproj .\src\SharedKernel\SharedKernel.csproj .\src\Web\Web.csproj
~~~~