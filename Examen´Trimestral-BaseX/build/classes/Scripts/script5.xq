for $b in doc("Bailes")//baile
where $b/profesor = "Jesús Lozano"
return replace value of node $b/sala with(10)