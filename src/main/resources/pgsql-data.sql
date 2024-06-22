INSERT INTO estados_articulo (nombre_estado_articulo)
VALUES ('Nuevo'),
       ('Usado'),
       ('Reacondicionado');


INSERT INTO tipos_articulo (nombre_tipo_articulo)
VALUES ('Material'),
       ('Tapete'),
       ('Orden Personalizada');


INSERT INTO articulo (nombre_articulo, descripcion, cantidad, estado_articulo_id, tipo_articulo_id)
VALUES ('PVC Ultramat', 'Material PVC ultramat resistente y duradero.', 50, 1, 2),
       ('Alfombra Deluxe', 'Alfombra deluxe para interiores, suave y cómoda.', 30, 1, 2),
       ('Alfombra Premium One', 'Alfombra premium one de alta calidad.', 20, 1, 2),
       ('Caucho Resistente', 'Material de caucho resistente para múltiples usos.', 60, 1, 1),
       ('Felpudo Antideslizante', 'Felpudo antideslizante para entradas.', 40, 1, 2),
       ('Lona Impermeable', 'Lona impermeable ideal para exteriores.', 25, 1, 1),
       ('Tejido de Nylon', 'Tejido de nylon resistente y ligero.', 70, 1, 1),
       ('Vinilo Resistente', 'Material de vinilo resistente y fácil de limpiar.', 35, 1, 1),
       ('Piso de Goma', 'Piso de goma para áreas de alto tráfico.', 45, 1, 1),
       ('Material de PVC', 'Material de PVC para diversas aplicaciones.', 55, 1, 1),
       ('Tapete de Microfibra', 'Tapete de microfibra suave y absorbente.', 20, 1, 2),
       ('Felpudo Elegante', 'Felpudo elegante y decorativo para entradas.', 15, 1, 2),
       ('Tapete de Algodón', 'Tapete de algodón natural y suave.', 10, 1, 2),
       ('Felpudo de Lujo', 'Felpudo de lujo con diseño exclusivo.', 30, 1, 2),
       ('Material de Polipropileno', 'Material de polipropileno resistente y versátil.', 50, 1, 1),
       ('Tapete de Bambú', 'Tapete de bambú natural y ecológico.', 25, 1, 2),
       ('Material de Sisal', 'Material de sisal duradero y sostenible.', 40, 1, 1),
       ('Tapete de Caucho', 'Tapete de caucho para áreas húmedas.', 20, 1, 2),
       ('Material de Poliéster', 'Material de poliéster ligero y resistente.', 15, 1, 1),
       ('Tapete de Lana', 'Tapete de lana natural y cálido.', 12, 1, 2);


INSERT INTO categoria (nombre_categoria, descuento_categoria)
VALUES ('Tapetes para Automóviles', 10),
       ('Tapetes para Camionetas', 15),
       ('Tapetes para Camiones', 20),
       ('Tapetes para SUV', 12),
       ('Tapetes para Vans', 18);


INSERT INTO tipos_vehiculos (nombre_tipo_vehiculo)
VALUES ('Automóvil Sedán'),
       ('Camioneta SUV'),
       ('Camión de Carga'),
       ('Van de Pasajeros');


INSERT INTO marcas_vehiculos (nombre_marca_vehiculo)
VALUES ('Toyota'),
       ('Ford'),
       ('Honda'),
       ('Chevrolet'),
       ('Nissan'),
       ('Volkswagen'),
       ('BMW'),
       ('Mercedes-Benz'),
       ('Audi'),
       ('Hyundai'),
       ('Kia');


INSERT INTO modelos_vehiculos (nombre_modelo_vehiculo, numero_modelo_vehiculo, marca_vehiculo_id, tipo_vehiculo_id)
VALUES ('Corolla', 3424, 1, 1),
       ('Civic', 2423, 3, 1),
       ('F-150', 4133, 2, 2),
       ('Silverado', 1234, 4, 2),
       ('Altima', 5342, 5, 1),
       ('Passat', 5432, 6, 1),
       ('X5', 6543, 7, 1),
       ('C-Class', 6541, 8, 1),
       ('A4', 2767, 9, 1),
       ('Elantra', 2576, 10, 1),
       ('Sorento', 9676, 11, 2),
       ('Kona', 2464, 11, 1),
       ('Santa Fe', 7654, 11, 1);