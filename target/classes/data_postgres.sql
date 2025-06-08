
-- SENSORES
INSERT INTO tb_sensor (tipo, unidade, valor_minimo, valor_maximo) VALUES
                                                                      ('Radiação UV', 'mW/cm²', 0, 10),
                                                                      ('Nível de Ruído', 'dB', 30, 120),
                                                                      ('Poluentes', 'ppm', 0, 500),
                                                                      ('Vazamento Químico', 'ppm', 0, 100),
                                                                      ('Bateria', '%', 0, 100),
                                                                      ('Temperatura da CPU', '°C', 0, 100),
                                                                      ('Velocidade do Vento', 'km/h', 0, 250),
                                                                      ('Pressão Barométrica', 'hPa', 800, 1100),
                                                                      ('Nível de Luminosidade', 'lux', 0, 100000),
                                                                      ('Qualidade do Ar', 'AQI', 0, 500),
                                                                      ('Vibração', 'Hz', 0, 200),
                                                                      ('Fluxo de Água', 'L/s', 0, 100),
                                                                      ('Radônio', 'Bq/m³', 0, 150),
                                                                      ('Concentração de CO₂', 'ppm', 0, 5000),
                                                                      ('Nível de CO', 'ppm', 0, 50);

-- ESTACOES
INSERT INTO tb_estacao (nm_estacao, cidade, uf, latitude, longitude) VALUES
                                                                         ('Estação Centro-Oeste', 'Goiânia', 'GO', -16.6869, -49.2648),
                                                                         ('Estação Nordeste', 'Salvador', 'BA', -12.9777, -38.5016),
                                                                         ('Estação Norte 2', 'Belém', 'PA', -1.4550, -48.5024),
                                                                         ('Estação Sul 2', 'Florianópolis', 'SC', -27.5954, -48.5480),
                                                                         ('Estação Leste 2', 'Fortaleza', 'CE', -3.7172, -38.5434),
                                                                         ('Estação Oeste 2', 'Campo Grande', 'MS', -20.4697, -54.6201),
                                                                         ('Estação Capital', 'Brasília', 'DF', -15.7939, -47.8828),
                                                                         ('Estação Ribeirão', 'Ribeirão Preto', 'SP', -21.1773, -47.8103),
                                                                         ('Estação Campinas', 'Campinas', 'SP', -22.9056, -47.0608),
                                                                         ('Estação Vitória', 'Vitória', 'ES', -20.3155, -40.3128),
                                                                         ('Estação João Pessoa', 'João Pessoa', 'PB', -7.1195, -34.8450),
                                                                         ('Estação Maceió', 'Maceió', 'AL', -9.6659, -35.7350),
                                                                         ('Estação Teresina', 'Teresina', 'PI', -5.0919, -42.8034),
                                                                         ('Estação Aracaju', 'Aracaju', 'SE', -10.9472, -37.0731),
                                                                         ('Estação Palmas', 'Palmas', 'TO', -10.1846, -48.3336);

-- ALERTAS
INSERT INTO tb_alerta (descricao, nivel, status) VALUES
                                                     ('Alerta de radiação alta', 'Alto', 'Ativo'),
                                                     ('Alerta de nível de ruído elevado', 'Médio', 'Ativo'),
                                                     ('Alerta de poluição do ar', 'Crítico', 'Ativo'),
                                                     ('Alerta de vazamento químico', 'Alto', 'Resolvido'),
                                                     ('Alerta de falha no sensor', 'Baixo', 'Ativo'),
                                                     ('Alerta de bateria baixa', 'Médio', 'Ativo'),
                                                     ('Alerta de superaquecimento', 'Alto', 'Ativo'),
                                                     ('Alerta de vento muito forte', 'Médio', 'Ativo'),
                                                     ('Alerta de inatividade prolongada', 'Baixo', 'Resolvido'),
                                                     ('Alerta de dados inconsistentes', 'Médio', 'Ativo'),
                                                     ('Alerta de inundação iminente', 'Crítico', 'Ativo'),
                                                     ('Alerta de erosão do solo', 'Alto', 'Ativo'),
                                                     ('Alerta de falta de comunicação', 'Médio', 'Ativo'),
                                                     ('Alerta de nível de umidade crítico', 'Alto', 'Ativo'),
                                                     ('Alerta de mudanças bruscas de temperatura', 'Médio', 'Ativo');

-- RISCOS
INSERT INTO tb_risco (tipo, descricao, valor) VALUES
                                                  ('Incêndio Florestal', 'Risco elevado de incêndio em área florestal', 0.90),
                                                  ('Inundação Urbana', 'Risco de inundação em área urbana devido a chuvas intensas', 0.70),
                                                  ('Deslizamento de Terra', 'Risco de deslizamento em encostas', 0.50),
                                                  ('Tempestade Elétrica', 'Risco de tempestade com raios e ventos fortes', 0.80),
                                                  ('Ventania', 'Risco de ventos muito fortes causando danos', 0.60),
                                                  ('Seca', 'Risco de período prolongado sem chuvas', 0.55),
                                                  ('Poluição do Ar', 'Risco de alta concentração de poluentes atmosféricos', 0.65),
                                                  ('Contaminação da Água', 'Risco de poluição em corpos hídricos', 0.45),
                                                  ('Avalanche', 'Risco de avalanche em regiões montanhosas', 0.30),
                                                  ('Furacão', 'Risco de tempestades tropicais severas', 0.85),
                                                  ('Tsunami', 'Risco de tsunami em áreas costeiras', 0.20),
                                                  ('Erupção Vulcânica', 'Risco de atividade vulcânica', 0.25),
                                                  ('Ondas de Calor', 'Risco de temperaturas extremas elevadas', 0.75),
                                                  ('Geada', 'Risco de geada em plantações', 0.40),
                                                  ('Granizo', 'Risco de queda de granizo', 0.50);

-- LEITURAS
INSERT INTO tb_leitura (data_hora, valor, sensor_id) VALUES
                                                         (TO_TIMESTAMP('2025-06-01 08:25:00', 'YYYY-MM-DD HH24:MI:SS'), 33.1, 1),
                                                         (TO_TIMESTAMP('2025-06-01 08:30:00', 'YYYY-MM-DD HH24:MI:SS'), 68.5, 2),
                                                         (TO_TIMESTAMP('2025-06-01 08:35:00', 'YYYY-MM-DD HH24:MI:SS'), 1010, 3),
                                                         (TO_TIMESTAMP('2025-06-01 08:40:00', 'YYYY-MM-DD HH24:MI:SS'), 40, 4),
                                                         (TO_TIMESTAMP('2025-06-01 08:45:00', 'YYYY-MM-DD HH24:MI:SS'), 15, 5),
                                                         (TO_TIMESTAMP('2025-06-01 08:50:00', 'YYYY-MM-DD HH24:MI:SS'), 5.5, 6),
                                                         (TO_TIMESTAMP('2025-06-01 08:55:00', 'YYYY-MM-DD HH24:MI:SS'), 80, 7),
                                                         (TO_TIMESTAMP('2025-06-01 09:00:00', 'YYYY-MM-DD HH24:MI:SS'), 180, 8),
                                                         (TO_TIMESTAMP('2025-06-01 09:05:00', 'YYYY-MM-DD HH24:MI:SS'), 45000, 9),
                                                         (TO_TIMESTAMP('2025-06-01 09:10:00', 'YYYY-MM-DD HH24:MI:SS'), 100, 10),
                                                         (TO_TIMESTAMP('2025-06-01 09:15:00', 'YYYY-MM-DD HH24:MI:SS'), 60, 11),
                                                         (TO_TIMESTAMP('2025-06-01 09:20:00', 'YYYY-MM-DD HH24:MI:SS'), 15, 12),
                                                         (TO_TIMESTAMP('2025-06-01 09:25:00', 'YYYY-MM-DD HH24:MI:SS'), 120, 13),
                                                         (TO_TIMESTAMP('2025-06-01 09:30:00', 'YYYY-MM-DD HH24:MI:SS'), 450, 14),
                                                         (TO_TIMESTAMP('2025-06-01 09:35:00', 'YYYY-MM-DD HH24:MI:SS'), 30, 15);
