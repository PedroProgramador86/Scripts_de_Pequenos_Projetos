#Mensagem pré escrita: 

print(f"{13 * "="} METODO {13 * "="}\n\n")

print(f"{10 * "="} 50 - 30 - 20 {10 * "="}\n")
# Captura de ganhos:


ganhos = float(input("Digite o seu ganho mensal: R$"))
ganhos_float = float(ganhos)


# Divisão dos ganhos:

porcento50 = (ganhos_float * 50) / 100

porcento30 = (ganhos_float * 30) / 100

porcento20 = (ganhos_float * 20) / 100

print(f"\n{12 * "="} Divisão: {12 * "="}\n")

print(f"50% Gastos Obrigatorios: R${porcento50:.2f}")
print(f"30% Lazer e Diverções: R${porcento30:.2f}")
print(f"20% Investimento: R${porcento20:.2f}")

print(f"Soma total: {porcento20 + porcento30 + porcento50}")