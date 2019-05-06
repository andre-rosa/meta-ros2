# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "libqt-opengl metapackage supporting qt4 and qt5"
AUTHOR = "Matthew Bries <mbries@swri.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "United_States_Government_Purpose & SwRI_Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=8e473b26ead33548c945bdaca143a08d"

ROS_BPN = "libqt_opengl"

ROS_BUILD_DEPENDS = " \
    qtbase \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    qtbase \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    qtbase \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/swri-robotics-gbp/qt_metapackages-release/archive/release/melodic/libqt_opengl/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4b39f3cfc35be41252bb7fb3c10f9231"
SRC_URI[sha256sum] = "864a495c5dbc587baac58d0cbc2b936fbd18cdae8123e1c34bf005c881a29ca6"
S = "${WORKDIR}/qt_metapackages-release-release-melodic-libqt_opengl-1.0.1-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('qt-metapackages', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/qt-metapackages/qt-metapackages_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/qt-metapackages/qt-metapackages-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/qt-metapackages/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/qt-metapackages/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
