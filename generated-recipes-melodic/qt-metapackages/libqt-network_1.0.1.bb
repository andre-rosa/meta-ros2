# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "libqt-network metapackage supporting qt4 and qt5"
AUTHOR = "Matthew Bries <mbries@swri.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "United_States_Government_Purpose & SwRI_Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=8e473b26ead33548c945bdaca143a08d"

ROS_BPN = "libqt_network"

ROS_BUILD_DEPENDS = " \
    libqt5-network \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libqt5-network \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libqt5-network \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/swri-robotics-gbp/qt_metapackages-release/archive/release/melodic/libqt_network/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "49fe20000fe22a1effce24ce26f36b3f"
SRC_URI[sha256sum] = "8c33c79ec52d6aa7513f01a41fbdc7fd770f727a854d84bfbb7a31ca4c93dbea"
S = "${WORKDIR}/qt_metapackages-release-release-melodic-libqt_network-1.0.1-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('qt-metapackages', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/qt-metapackages/qt-metapackages_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/qt-metapackages/qt-metapackages-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/qt-metapackages/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/qt-metapackages/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
