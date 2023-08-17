### założenia:

1. chce móc kupić bilet
2. chce zapłacić za bilet
3. chce mieć swoje informacje na bilecie
4. przy wejściu/wyjściu weryfikuje czy ja to ja
5. chce móc mieć wybór rodzaju biletu (vip etc)

### ksw:

1. sprawdzam dostępne trybuny i na slocie klikam rezerwacje
2. sprawdzam cene za konkretne miejsce i płace online
3. wprowadzam swoje dane osobowe na stronie
4. zczytuje mi QR kod na wejściu
5. wybieram z listy konktretne miejsce i mam tam jego rodzaj, czy vip czy płyta etc

### parking w galerii:

1. podjeżdżam i dostaje bilet 
2. sprawdzam jak długo istniał bilet i płace za czas
3. automatycznie czyta mi rejestracje
4. przy wyjściu czyta rejestracje
5. kamera czyta rodzaj pojazdu(moto, auto etc) i na tej podstawie daje miejsce


### wspólne:

___

#### sloty

```yaml
sloty:
  lista dostępnych:

slot:
  typ: vip/auto/moto/ dla ksw plyta/trybuna/vip
  czy jest dostepny:
  sektor:
```

zdarzenia biznesowe:

    - zajmij slot

#### dane klienta

```yaml
###dla ksw
dane:
  imie:
  nazwisko:
  id dukumentu:

###dla parkingu
dane:
  rejestracja:
  rodzaj pojazdu:
  
```
#### wydruk biletu

````yaml
wydruk:
  dane klienta + dane biletu + dane slotu + dane firmy
````

#### dane firmy

```yaml
dane:
  nazwa:
  logotyp:
  nip:
```

#### cennik

cena zależy od:
 - od typu slotu
 - czasu
 - promocji

#### płatność

w momencie płatności bierzemy slot i z cennika obliczamy cenę

trzeba sprawdzić czy można zapłacić za bilet, np:
- czy slot jest zajęty

#### reguły czy można zapłacić za bilet etc.
