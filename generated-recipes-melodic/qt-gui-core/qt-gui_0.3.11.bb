# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "qt_gui provides the infrastructure for an integrated graphical user interface based on Qt.     It is extensible with Python- and C++-based plugins (implemented in separate packages) which can contribute arbitrary widgets.     It requires either PyQt or PySide bindings."
AUTHOR = "D. Hood <dhood@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/qt_gui"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "qt_gui"

ROS_BUILD_DEPENDS = " \
    python-qt5-bindings \
    qtbase \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    python-qt-binding \
    python-rospkg \
    tango-icon-theme \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-qt-binding \
    python-rospkg \
    tango-icon-theme \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/melodic/qt_gui/0.3.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2b3d69750491bf1c5ac433415f37149d"
SRC_URI[sha256sum] = "4a87192e0c9880e2d7d14b67c3ee5d156a5bc6d1e11f8e4a23a3ced3d74e57b1"
S = "${WORKDIR}/qt_gui_core-release-release-melodic-qt_gui-0.3.11-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('qt-gui-core', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/qt-gui-core/qt-gui-core_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/qt-gui-core/qt-gui-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/qt-gui-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/qt-gui-core/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
