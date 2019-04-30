# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common plugins for the Mapviz visualization tool"
AUTHOR = "Marc Alban <malban@swri.org>"
HOMEPAGE = "https://github.com/swri-robotics/mapviz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    actionlib \
    cv-bridge \
    gps-common \
    image-transport \
    libqt-opengl-rosdev \
    libqt-rosdev \
    map-msgs \
    mapviz \
    marti-common-msgs \
    marti-nav-msgs \
    marti-visualization-msgs \
    move-base-msgs \
    nav-msgs \
    pluginlib \
    roscpp \
    sensor-msgs \
    std-msgs \
    stereo-msgs \
    swri-image-util \
    swri-math-util \
    swri-route-util \
    swri-transform-util \
    swri-yaml-util \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    qt-qmake-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    cv-bridge \
    gps-common \
    image-transport \
    map-msgs \
    mapviz \
    marti-common-msgs \
    marti-nav-msgs \
    marti-visualization-msgs \
    move-base-msgs \
    nav-msgs \
    pluginlib \
    roscpp \
    sensor-msgs \
    std-msgs \
    stereo-msgs \
    swri-image-util \
    swri-math-util \
    swri-route-util \
    swri-transform-util \
    swri-yaml-util \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    cv-bridge \
    gps-common \
    image-transport \
    libqt-core \
    libqt-opengl \
    map-msgs \
    mapviz \
    marti-common-msgs \
    marti-nav-msgs \
    marti-visualization-msgs \
    move-base-msgs \
    nav-msgs \
    pluginlib \
    roscpp \
    sensor-msgs \
    std-msgs \
    stereo-msgs \
    swri-image-util \
    swri-math-util \
    swri-route-util \
    swri-transform-util \
    swri-yaml-util \
    tf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/melodic/mapviz_plugins/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "fbb0116b89f8ef0c3c57f2509b1aa955"
SRC_URI[sha256sum] = "be044acba9267e5b7039c30a67b9acdf824e5c326a28fb1faa6a770646c9cb7e"
S = "${WORKDIR}/mapviz-release-release-melodic-mapviz_plugins-1.1.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/mapviz/mapviz_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/mapviz/mapviz_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mapviz/mapviz-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mapviz/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mapviz/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
