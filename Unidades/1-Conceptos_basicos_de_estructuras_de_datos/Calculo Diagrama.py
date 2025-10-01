import numpy as np
import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import Axes3D

# Función de efectividad
def efectividad(x, y, z):
    return 80 * (1 - np.exp(-0.3 * x)) + 15 * np.log(y + 1) + 5 * z

# 1. Superficie 3D: E(x, y) con z=6
fig1 = plt.figure(figsize=(10, 7))
ax1 = fig1.add_subplot(111, projection='3d')
x = np.linspace(0, 7, 50)
y = np.linspace(0, 120, 50)
X, Y = np.meshgrid(x, y)
Z = 6  # Calidad fija
E = efectividad(X, Y, Z)
surf = ax1.plot_surface(X, Y, E, cmap='viridis', alpha=0.8)
ax1.set_xlabel('Frecuencia de Repaso (x)')
ax1.set_ylabel('Duración de Sesión (y, min)')
ax1.set_zlabel('Efectividad (E)')
ax1.set_title('Figura 1: Superficie 3D E(x, y) con z=6')
fig1.colorbar(surf, label='Efectividad')
plt.savefig('superficie_z6.png', dpi=300, bbox_inches='tight')
plt.close()

# 2. Curvas de Nivel: E(x, y) con z=6
fig2 = plt.figure(figsize=(8, 6))
x = np.linspace(0, 7, 50)
y = np.linspace(0, 120, 50)
X, Y = np.meshgrid(x, y)
E = efectividad(X, Y, 6)
contour = plt.contour(X, Y, E, levels=15, cmap='coolwarm')
plt.clabel(contour, inline=True, fontsize=8)
plt.xlabel('Frecuencia de Repaso (x)')
plt.ylabel('Duración de Sesión (y, min)')
plt.title('Figura 2: Curvas de Nivel E(x, y) con z=6')
plt.colorbar(label='Efectividad')
plt.grid(True)
plt.savefig('contorno_z6.png', dpi=300, bbox_inches='tight')
plt.close()

# 3. Gráfica 2D: E(x) con y=30, z=6
fig3 = plt.figure(figsize=(8, 5))
x_vals = np.linspace(0, 7, 100)
E_2d = efectividad(x_vals, 30, 6)
plt.plot(x_vals, E_2d, 'b-', linewidth=2)
plt.xlabel('Frecuencia de Repaso (x)')
plt.ylabel('Efectividad (E)')
plt.title('Figura 3: E(x) para y=30 min, z=6')
plt.grid(True)
plt.savefig('curva_2d.png', dpi=300, bbox_inches='tight')
plt.close()

print("Gráficas generadas: superficie_z6.png, contorno_z6.png, curva_2d.png")