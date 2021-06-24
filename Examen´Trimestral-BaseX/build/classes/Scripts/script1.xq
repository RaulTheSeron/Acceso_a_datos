for $b in doc("Bailes")//baile
where $b/plazas < 20
return data($b/nombre)