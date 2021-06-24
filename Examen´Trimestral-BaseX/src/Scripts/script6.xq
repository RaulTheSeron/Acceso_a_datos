for $b in doc("Bailes")//baile
where $b/@id =(
  for $a in doc("calendario")//disponibles
  return data($a/id))
return data($b/nombre)
