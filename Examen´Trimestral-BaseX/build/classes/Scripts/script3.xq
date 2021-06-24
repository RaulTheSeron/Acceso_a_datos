for $p in doc("Bailes")//baile
where $p/precio/@cuota = "mensual"
return data($p/profesor)