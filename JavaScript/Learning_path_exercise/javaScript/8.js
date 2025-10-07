const fn = () => Promise.resolve()
                        .then(() => fn());

fn();