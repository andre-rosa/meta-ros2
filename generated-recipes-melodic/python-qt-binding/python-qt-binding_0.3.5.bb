# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This stack provides Python bindings for Qt.     There are two providers: pyside and pyqt.  PySide is released under     the LGPL.  PyQt is released under the GPL.      Both the bindings and tools to build bindings are included from each     available provider.  For PySide, it is called &quot;Shiboken&quot;.  For PyQt,     this is called &quot;SIP&quot;.      Also provided is adapter code to make the user's Python code     independent of which binding provider was actually used which makes     it very easy to switch between these."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/python_qt_binding"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    python-qt5-bindings \
    qtbase \
    rosbuild \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    python-qt5-bindings \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-qt5-bindings \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/python_qt_binding-release/archive/release/melodic/python_qt_binding/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b287377a9650becd56fdb3baee29ce03"
SRC_URI[sha256sum] = "7212340713f18af32a6ee003889c16117717bc40976fe919394ce105283f4d2f"
S = "${WORKDIR}/python_qt_binding-release-release-melodic-python_qt_binding-0.3.5-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/python-qt-binding/python-qt-binding_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/python-qt-binding/python-qt-binding_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/python-qt-binding/python-qt-binding-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/python-qt-binding/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/python-qt-binding/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
