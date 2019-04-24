# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "mapviz"
AUTHOR = "Marc Alban <malban@swri.org>"
ROS_AUTHOR = "Marc Alban"
HOMEPAGE = "https://github.com/swri-robotics/mapviz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mapviz"
ROS_BPN = "mapviz"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    freeglut \
    image-transport \
    libglew-dev \
    libqt-opengl-rosdev \
    libqt-rosdev \
    libxi-dev \
    libxmu-dev \
    marti-common-msgs \
    message-generation \
    pluginlib \
    rosapi \
    roscpp \
    rqt-gui \
    rqt-gui-cpp \
    std-srvs \
    swri-transform-util \
    swri-yaml-util \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    pkgconfig-native \
    qt-qmake-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    freeglut \
    image-transport \
    libglew-dev \
    libxi-dev \
    libxmu-dev \
    marti-common-msgs \
    pluginlib \
    rosapi \
    roscpp \
    rqt-gui \
    rqt-gui-cpp \
    std-srvs \
    swri-transform-util \
    swri-yaml-util \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    freeglut \
    image-transport \
    libglew-dev \
    libqt-core \
    libqt-opengl \
    libxi-dev \
    libxmu-dev \
    marti-common-msgs \
    message-runtime \
    pluginlib \
    rosapi \
    roscpp \
    rqt-gui \
    rqt-gui-cpp \
    std-srvs \
    swri-transform-util \
    swri-yaml-util \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/melodic/mapviz/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bd2174433f810c298fa965feae1a30c7"
SRC_URI[sha256sum] = "f616f580f6f6712bc46043efb0a4fc6131a412504c23519d17074846c43cab8d"
S = "${WORKDIR}/mapviz-release-release-melodic-mapviz-1.1.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('mapviz', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('mapviz', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mapviz/mapviz_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mapviz/mapviz-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mapviz/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mapviz/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
