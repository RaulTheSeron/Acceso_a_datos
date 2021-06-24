for $b in doc("Bailes")//baile[sala=2]
where $b/precio/@cuota = "trimestral"
return data($b/nombre)