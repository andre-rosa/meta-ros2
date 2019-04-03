# meta-qt5 installs python package to python3.5m but ROS found it from python3.5 (without ABI)

do_install_append() {
    install -d ${D}${libdir}/${PYTHON_DIR}/site-packages
    cd ${D}${libdir}/${PYTHON_DIR}/site-packages
    ln -sf ../../${PYTHON_DIR}${PYTHON_ABI}/site-packages/PyQt5 PyQt5
}

FILES_${PN} += "${libdir}/${PYTHON_DIR}/site-packages"
