<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="UTF-8" />
<title>Cadastro de Despesa</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
</head>
<body>

	<nav class="navbar bg-light navbar-light"></nav>

	<form class="form-horizontal" method="post" action="/despesas/salvar">
		<div class="card">
			<div class="card-header">
				<div class="clearfix">
	   				<h4 class="card-title impacta-titulo-panel">Nova Despesa
	   				</h4>
	   			</div>
			</div>
			<div class="card-body">
				<div class="form-group">
					<label for="descricao" class="col-sm-2 control-label">Descrição</label>
					<div class="col-sm-4">
						<input type="text" class="form-control" id="descricao"
							name="descricao" />
					</div>
				</div>
				<div class="form-group">
					<label for="categoria" class="col-sm-2 control-label">Categoria</label>
					<div class="col-sm-2">
						<select class="form-control" name="categoria" >
						</select>
					</div>
				</div>

				<div class="form-group">
					<label for="data" class="col-sm-2 control-label">Data</label>
					<div class="col-sm-2">
						<input type="text" class="form-control" id="data" name="data" />
					</div>
				</div>

				<div class="form-group">
					<label for="valor" class="col-sm-2 control-label">Valor</label>
					<div class="col-sm-2">
						<input type="text" class="form-control" id="valor" name="valor" />
					</div>
				</div>

				<div class="form-group">
					<label for="observacoes" class="col-sm-2 control-label">Observações</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" id="observacoes"
							name="observacoes" />
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-primary">Salvar</button>
					</div>
				</div>
			</div>
		</div>
	</form>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>