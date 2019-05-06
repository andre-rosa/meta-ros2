# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This stack provides Python bindings for Qt.     There are two providers: pyside and pyqt.  PySide2 is available under     the GPL, LGPL and a commercial license.  PyQt is released under the GPL.      Both the bindings and tools to build bindings are included from each     available provider.  For PySide, it is called &quot;Shiboken&quot;.  For PyQt,     this is called &quot;SIP&quot;.      Also provided is adapter code to make the user's Python code     independent of which binding provider was actually used which makes     it very easy to switch between these."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Dave Hershberger"
HOMEPAGE = "http://ros.org/wiki/python_qt_binding"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=ced11b5ec2a0776fd01740115328457b"

ROS_CN = "python_qt_binding"
ROS_BPN = "python_qt_binding"

ROS_BUILD_DEPENDS = " \
    python3-pyqt5 \
    qtbase \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python3-pyqt5 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/python_qt_binding-release/archive/release/dashing/python_qt_binding/1.0.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c9ed340e5d0a5d1a652100bb1c6c5df3"
SRC_URI[sha256sum] = "a116343c89897e466c720e3b892c913992b1771b91c40e02fcfd6632a8d0f7a4"
S = "${WORKDIR}/python_qt_binding-release-release-dashing-python_qt_binding-1.0.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('python-qt-binding', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('python-qt-binding', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/python-qt-binding/python-qt-binding_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/python-qt-binding/python-qt-binding-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/python-qt-binding/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/python-qt-binding/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
